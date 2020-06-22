package java0618Chart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {
	public ArrayList<EnergyVO> getList() {

		ArrayList<EnergyVO> list = new ArrayList<EnergyVO>();

		// 1. 파일이 존재하는 위취와 정보를 담는 객체 생성
		File file = new File("C:\\Users\\SMHRD\\Desktop\\chartlib\\광주광역시 계약구분별 사용량 데이터.csv");

		// 2. 파일객체를 읽어들여서 값을 꺼내는 input 스트림 생성
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
