package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	//�����ͺ��̽����� deptno�� �ش��ϴ� ������ ����

			//1.������ �Է¹ޱ� ,deptno�� �Է¹޴� �۾�
			//Ű����� ���� �Է��� ���� �� �ִ� ��ü ����
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �μ���ȣ(����):");
			int deptno = sc.nextInt();
			System.out.println("�μ���ȣ : " + deptno);
			sc.close();
			
			//2.�Է¹��� �����͸� ������ �����ͺ��̽��� �����ϱ�
			//�����ͺ��̽� ���� ����
			Connection con = null;
			//SQL ���� ����
			PreparedStatement pstmt = null;
			try {
				//����̹� Ŭ���� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//�����ͺ��̽� ����
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		
				//autocommit ����
				con.setAutoCommit(false);
				
				//System.out.println("���Ӽ���");
				//SQL ���ఴü ����
				pstmt = con.prepareStatement("delete from dept where deptno = ? ");
				//������ ���ε�
				pstmt.setInt(1, deptno);
				//sql ����
				//�����ϰ� ���� ������� ���� ������ �����մϴ�.
				//���ǿ� �´� �����Ͱ� ������ �����ϴ°� �ƴϰ� �����ϴ� ���� ������ 0�Դϴ�. �����ϸ� ���ܰ� �߻��ϹǷ� catch�� ���ϴ�.
			   int r = pstmt.executeUpdate();
				if(r > 0) {
			   System.out.println("��������");
			   con.commit();
			}
				else
					System.out.println("���ǿ� �´� �����Ͱ� �����ϴ�.");
			}catch(Exception e) {
				try {
					//�۾����� ���ܰ� �߻��� ��� rollback�� ȣ��
					con.rollback();
				}catch(Exception e1) { }
			//������ ������ ���	
			System.out.println(e.getMessage());
			//���ܰ� �߻��� ������ ������
			e.printStackTrace();
			}finally {
				try {
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				}catch(Exception e) { }
			}


	}

}
