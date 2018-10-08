package com.company;

public class Ruler {
    int lenght;
    int depth;

    public Ruler(int lenght, int depth) {
        this.lenght = lenght;
        this.depth = depth;
    }

    public void display(){
        for(int i = this.lenght; i > 0; i--){
            System.out.print(new String(new char[this.depth]).replace("\0", "-"));
            System.out.println(" " + (i));
            for(int j = 1; j < this.depth; j++){
                System.out.println(new String(new char[j]).replace("\0", "-"));
            }
            for(int j = this.depth; j > 1; j--){
                System.out.println(new String(new char[j]).replace("\0", "-"));
            }
        }
    }
}
