/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Sandun Priyanka
 * 
 * 
 * * Following Example shows how to create TreeSet using
         * TreeSet(Comparator comp)
         *
         * Constructs a new, empty set, sorted according to the given
         * comparator. All elements inserted into the set must be mutually
         * comparable by the given comparator: comparator.compare(e1, e2) must
         * not throw a ClassCastException for any elements e1 and e2 in the set.
         * If the user attempts to add an element to the set that violates this
         * constraint, the add(Object) call will throw a ClassCastException
         *
         *
         * To implement your own sorting functionality with TreeSet, you have to
         * pass Comparator object along with TreeSet constructor call. The
         * Comparator implementation holds the sorting logic. You have to
         * override compare() method to provide the sorting logic. Below example
         * shows how to sort TreeSet using comparator.
         * 
 *
 * 
 */
public class TreeSetComparator {
 public static void main(String a[]){
        //By using name comparator (String comparison)
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("John",6000));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));
        for(Empl e:nameComp){
            System.out.println(e);
        }
        System.out.println("===========================");
        //By using salary comparator (int comparison)
        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",6000));
        salComp.add(new Empl("Crish",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
    }
}
 
class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}  
 
class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Empl{
     
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}
