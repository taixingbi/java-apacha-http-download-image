package hello;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------app start----------");
//        HttpDownload httpDownload = new HttpDownload();
        String uri = "https://media-dev-eu-2.mirakl.net/SOURCE/021b10aacb7d48978c00d77f2a56b728";
        String localPath = "./tmp/";
        String localName= "test.webp";
        HttpDownload.process(uri, localPath + localName);
        System.out.println("----------app end----------");
    }
}
