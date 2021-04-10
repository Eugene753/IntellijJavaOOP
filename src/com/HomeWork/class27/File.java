package com.HomeWork.class27;

abstract public class File {

    String file;
    String program;

    File(String file,String program){
        this.file=file;
        this.program=program;
    }

    abstract void open();

    void edit(){
        System.out.println("File edit");
    }
    void close(){
        System.out.println("File closed");
    }
}
class JavaFile extends File{
    JavaFile(String file,String program){
        super(file,program);
    }
    @Override
    void open(){
        System.out.println("To open "+file+" we need "+program+ " or "+program);
    }
}
class WordFile extends File{
    WordFile(String file,String program){
        super(file,program);
    }
    @Override
    void open(){
        System.out.println("To open "+file+" we need "+program+" to be installed");
    }
}
class PdfFile extends File{
    PdfFile(String file,String program){
        super(file,program);
    }
    @Override
    void open(){
        System.out.println("To open "+file+" we need "+program+" to be installed");
    }
}
