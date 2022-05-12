package sec04.exam01_file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		//로컬 경로
		File dir = new File("C:/Dev/Temp/Dir");
		File file1 = new File("C:/Dev/Temp/file1.txt");
		File file2 = new File("C:/Dev/Temp/file2.txt");
		
		//URI(Uniform Resource Identifier) : 네트워크 상의 자원을 가리키는 식별방법
		//글로벌적인 URI 경로
		File file3 = new File(new URI("file:///C:/Dev/Temp/file3.txt")); //예외전가
		
		//경로에 존재하지 않는 모든 하위폴더 생성
		if(dir.exists()==false) {//C:/Dev/Temp/Dir 이 폴더가 존재하지 않으면 생성
			dir.mkdirs(); //경로에 없는 모든 폴더를 생성
		}
		//파일 생성
		if(file1.exists() == false) {file1.createNewFile();} //없으면 생성시켜줘
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//폴더의 목록(내용보기)
		//\\ : Escape Sequence기능 중 \(역슬래시)가 사용되므로 \\ 2번을 쳐야 사용 가능
		File temp = new File("C:\\Dev\\Workspace\\chap15\\src\\sec01\\exam01_basic");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		System.out.println("날짜     시간     형태     크기     이름");
		File[] contents = temp.listFiles();//listFiles(): 작업경로의 내용보기(폴더, 파일) 정보가 contents안에 다 있음
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));//file.lastModified(): 수정한 날짜
			if(file.isDirectory()) {//file이 참조하고 있는 것이 폴더면 true, 파일이면 false
				System.out.print("\t<DIR>\t\t\t" + file.getName()); 
			} else {
				System.out.print("\t" + file.length() + "byte" + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
