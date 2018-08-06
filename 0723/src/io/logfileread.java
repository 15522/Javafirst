package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class logfileread {
	
	public static void main(String[] args) {
	//1.BufferedReader ��ü �����
	BufferedReader br =null;
	try {
		br = new BufferedReader(new FileReader("C:\\Users\\503-22\\Documents\\���¿�\\�ڹ���������\\���ϵ�\\access_log.txt"));
		//2. �� ������ ������ �о ���
		//3. �� ������ ������ �о �������� �����ؼ� ù��° �� ���.
		//4.Hashmap�� �̿��ؼ� ������ ip �� Ƚ���� ���
		HashMap<String, Integer> map = new HashMap<>();
		//5.HashMap�� �̿��ؼ� ������ IP �� Ʈ���� �հ� ���
		HashMap<String, Integer> traffic = new HashMap<>();
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			//System.out.println(line);
			String[]ar = line.split(" ");
			//System.out.println(ar[0]);
			//ip�� ����� �����͸� �����ɴϴ�.
			Integer count = map.get(ar[0]);
			//����� �����Ͱ� ������ 1�� �����մϴ�.
			if(count == null) {
			map.put(ar[0], 1);
			}
			//����� �����Ͱ� ������ 1�� ���ؼ� �����մϴ�.
			else {
				map.put(ar[0],count + 1);
			}
			Integer traf = traffic.get(ar[0]);
			if(traf  == null) {
				if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
					traffic.put(ar[0],Integer.parseInt(ar[9]));
				}
			}else {
				if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
					traffic.put(ar[0],traf + Integer.parseInt(ar[9]));
				}
			}

		}
		//���� ��� �����͸� ���
		Set<String> keySet = map.keySet();
		for(String Key : keySet) {
			System.out.println(Key + ":" + map.get(Key));
		}
		System.out.println("================");
		keySet = traffic.keySet();
		for(String key : keySet) {
			System.out.println(key + ":" + traffic.get(key));
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		try {
			if(br != null)
				br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

}