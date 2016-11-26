package testpkg;


        import java.io.*;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Objects;

public class FileHW {

    public static void main(String[] args) throws IOException {
        FileHW file=new FileHW();
        Map<String,String> map=new HashMap<>();
        map.put("kartopla","main");
        //map.put("main","kartopla");
        /*System.out.println(file.replacer(map));
        System.out.println(file.fileContentReplacer(map));*/
        file.fileContentMerger(map);
        System.out.println(file.checkWord("main"));
    }

    public String replacer(Map<String, String> map){
        //read File
        String forResult="";
        String result="";
        try(BufferedReader br=new BufferedReader(new FileReader("D:/1.txt"))) {

            String line = br.readLine();
            int countOfLine = 0;
            while (line != null) {
                countOfLine++;
            }
            int countOfWrite = 0;
            while (countOfLine > countOfWrite && line != null) {
                forResult = forResult + line;
                forResult = forResult + "\n" + " sedthftsd ";
                line = br.readLine();
                countOfWrite++;
            }
            br.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

        //Delete word is from map
        String[] deleteWord= forResult.split(" sedthftsd ");
        for(int i=0;i<deleteWord.length;i++){
            String str=deleteWord[i];
            if(map.containsKey(str)){
                deleteWord[i]= map.get(str);
            }
        }

        //Rewrite file
        for(String str:deleteWord){
            result=result+str+" ";
        }
        return result;
    }

    public File fileContentReplacer(Map<String, String> map){
        File file=new File("D:/files/file.txt");
        //read File
        String linkTofile="D:/files/file.txt";
        String forResult="";
        String result="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(linkTofile));
            String line = br.readLine();
            int countOfLine = 0;
            while (line != null) {
                countOfLine++;
            }
            int countOfWrite = 0;
            while (countOfLine > countOfWrite && line != null) {
                forResult = forResult + line;
                forResult = forResult + " idfshgudftg ";
                line = br.readLine();
            }
            //br.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

        //Delete word is from map
        String[] deleteWord= forResult.split(" ");
        for(int i=0;i<deleteWord.length;i++){
            String str=deleteWord[i];
            if(map.containsKey(str)){
                deleteWord[i]= map.get(str);
            }
        }
        for(String str:deleteWord){
            result=result+str+" ";
        }
        //Rewrite file
        String forFile[]=result.split(" idfshgudftg ");
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("D:/files/file.txt"))) {
            for (String str : forFile) {
                bw.write(str);
                bw.newLine();
            }
            //bw.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        return file;
    }
    public File fileContentMerger(Map<String, String> map){
        File file=new File("D:/files/file.txt");
        System.out.println(replacer(map));
        fileContentReplacer(map);
        return file;
    }
    public int checkWord(String word)throws IOException{
        HashMap nothing=new HashMap();
        nothing.put("дЛЯ ТОГО ЧТОБ ТЕКСТ СОХРАНИЛСя, а на руссоком чтоб не совпал )))","");
        String[] str=replacer(nothing).split(" ");
        int result=0;
        for(String string:str){
            if(Objects.equals(string,word)){
                result++;
            }
        }
        return result;
    }

}
