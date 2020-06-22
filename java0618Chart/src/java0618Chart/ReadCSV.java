package java0618Chart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {
	public ArrayList<EnergyVO> getList() {

		ArrayList<EnergyVO> list = new ArrayList<EnergyVO>();

		// 1. ������ �����ϴ� ����� ������ ��� ��ü ����
		File file = new File("C:\\Users\\SMHRD\\Desktop\\chartlib\\���ֱ����� ��౸�к� ��뷮 ������.csv");

		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ input ��Ʈ�� ����
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();

			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] value = line.split(",");

				String division = value[0];
				int usage = Integer.parseInt(value[1]);
				String month = value[2];

				EnergyVO vo = new EnergyVO(division, usage, month);
				list.add(vo);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
