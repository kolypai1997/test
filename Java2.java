/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kolyp
 */
public class Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        List X = new ArrayList();//инициализация списка чисел которые делятся на 3
        List S = new ArrayList();//список чисел которые делятся на 7
        List M = new ArrayList();//список чисел которые делятся на 21
        int d;
        boolean flag=false;//флаг обозначающий были ли значения не вошедшие ни в один список
        try{
            for(int i=0;i<args.length;i++){
                d=Integer.parseInt(args[i]);
                if(d%3==0){
                    X.add(d);
                }
                if(d%7==0){
                   S.add(d);
                }
                if(d%21==0){
                   M.add(d);
                }
                if((d%3!=0)&(d%7!=0)&(d%21!=0))
                {
                    flag=true;
                }
            }
        }
        catch(NumberFormatException ex){
            System.out.println("Неверный формат входных данных "+ex);
        }
        //выводим меню
        System.out.println("Введите команду: ");
        System.out.println("init array");
        System.out.println("print");
        System.out.println("print type");
        System.out.println("anyMore");
        System.out.println("clear type");
        System.out.println("merge");
        System.out.println("help");
        System.out.println("exit");
       
        String str;
        Scanner c= new Scanner(System.in);
       //double v;
        do{
            str=c.nextLine();
            if(str.compareTo("exit")==0){//выход из программы
                break;
            }
            switch(str){
                case "init array":{
                    while(c.hasNextInt()){
                        d =c.nextInt();
                        if(d%3==0){
                            X.add(d);
                        }
                        if(d%7==0){
                           S.add(d);
                        }
                        if(d%21==0){
                           M.add(d);
                        }
                        if((d%3!=0)&(d%7!=0)&(d%21!=0))
                        {
                            flag=true;
                        }
                                                         
                    }
                    Collections.sort(X);
                    Collections.sort(S);
                    Collections.sort(M);
                    break;
                }
                case "print":{
                    if(X.isEmpty()==true){
                     System.out.println("Список X пуст");   
                    }else{
                        System.out.print("Список Х содержит: ");
                        for(int i=0;i<X.size();i++){
                            System.out.print(" "+ X.get(i));
                        }
                        System.out.println();
                    }
                    if(S.isEmpty()==true){
                     System.out.println("Список S пуст");   
                    }else{
                        System.out.print("Список S содержит: ");
                        for(int i=0;i<S.size();i++){
                            System.out.print(" "+ S.get(i));
                        }
                        System.out.println();
                    }
                    if(M.isEmpty()==true){
                     System.out.println("Список M пуст");   
                    }else{
                        System.out.print("Список M содержит: ");
                        for(int i=0;i<M.size();i++){
                            System.out.print(" "+ M.get(i));
                        }
                        System.out.println();
                    }
                    break;
                }
                case "print X":{
                    if(X.isEmpty()==true){
                     System.out.println("Список X пуст");   
                    }else{
                        System.out.print("Список Х содержит: ");
                        for(int i=0;i<X.size();i++){
                            System.out.print(" "+ X.get(i));
                        }
                        System.out.println();
                    }
                    break;
                }
                case "print S":{
                    if(S.isEmpty()==true){
                     System.out.println("Список S пуст");   
                    }else{
                        System.out.print("Список S содержит: ");
                        for(int i=0;i<S.size();i++){
                            System.out.print(" "+ S.get(i));
                        }
                        System.out.println();
                    }
                    break;
                }
                case "print M":{
                    if(M.isEmpty()==true){
                     System.out.println("Список M пуст");   
                    }else{
                        System.out.print("Список M содержит: ");
                        for(int i=0;i<M.size();i++){
                            System.out.print(" "+ M.get(i));
                        }
                        System.out.println();
                    }
                    break;
                }
                case "anyMore":{
                    if(flag==true){
                    System.out.println("true");
                    }else
                    {
                        System.out.println("false");
                    }
                    break;
                }
                case "merge":{
                    List k = new ArrayList();
                    k.addAll(X);
                    X.clear();
                    k.addAll(S);
                    S.clear();
                    k.addAll(M);
                    M.clear();
                    Collections.sort(k);
                    System.out.print("Объединенный список содержит: ");
                    for(int i=0;i<k.size();i++){
                        System.out.print(" "+ k.get(i));
                    }
                    System.out.println();
                    break;
                }
                case "clear X":{
                    X.clear();
                    break;
                }
                case "clear S":{
                    S.clear();
                    break;
                }
                case "clear M":{
                    M.clear();
                    break;
                }

                case "help":{
                    System.out.println("init array - инициализация набором значений array");
                    System.out.println("print - печать всех списков");
                    System.out.println("print type - печать конкретного списка(X,S,M)");
                    System.out.println("anyMore - выводит на экран были ли значения не вошедшие не в один список");
                    System.out.println("clear type - чистка списка");
                    System.out.println("merge - слить все списки в один вывести на экран и очистить все списки");
                    System.out.println("help - вывод справки по командам");
                    System.out.println("exit - выход");
                    break;
                }
                
                default:
                    System.out.println("Нет введенной команды: "+ str);
            }
        }while(true);
        System.out.println("Программа завершила свою работу");
    }
    
}
