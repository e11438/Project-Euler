import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	
	private String path;
	
	public ReadFile(String file_path){
		path=file_path;
	}
	
	public String[] openFile() throws IOException{
		
		FileReader fr = new FileReader(path);
		BufferedReader br= new BufferedReader(fr);
		
		int numOfLines=readLines();
		String[] textData= new String[numOfLines];
		
		for(int i=0;i<numOfLines;i++){
			textData[i]=br.readLine();
		}
		
		br.close( );
		return textData;
	}

	int readLines() throws IOException{
		FileReader fileToRead =new FileReader(path);
		BufferedReader bf=new BufferedReader(fileToRead);
		
		String line;
		int numOfLines=0;
		
		while((line=bf.readLine())!=null){
			numOfLines++;
		}
		bf.close();
		return numOfLines;
		
	}
}
