package buoi1b.bai3;

import java.util.Random;

public class testmain {
    public static void main(String[] args) {
        // ta
        Student[] students = new Student[3];
        students[0] = new Student(1,"s1", 7);
        students[1] = new Student(2,"s2",5);
        students[2] = new Student(3 ,"s3", 9);

        // Mac dinh sap xep Danh sach student theo tang dan cua diem?
        SortArray sortArray = new SortArray();
        // In ra danh sach truoc khi sap xep
        sortArray.printArray(students);
        // In ra danh sach sau khi sap xep
        sortArray.sorted(students);
        sortArray.printArray(students);

        // Tao mang hinh tron
        HinhTron[] hinhTrons = new HinhTron[10];
        Random random = new Random();
        for (int i = 0; i < hinhTrons.length ; i++) {
            hinhTrons[i]= new HinhTron(random.nextInt(100)+1);
        }
        // In ra 10 hinh do
        sortArray.printArray(hinhTrons);
        // In ra 10 hinh sap xep
        sortArray.sorted(hinhTrons);
        sortArray.printArray(hinhTrons);
        // tao ra 10 hinh vuong
        HinhVuong[] hinhVuongs = new HinhVuong[10];
        Random random1 = new Random();
        for (int i = 0; i < hinhVuongs.length; i++) {
            hinhVuongs[i] = new HinhVuong(random1.nextInt(100)+1);
        }


        // in ra 10 vuong
        sortArray.printArray(hinhVuongs);
        sortArray.sorted(hinhVuongs);
        sortArray.printArray(hinhVuongs);
    }
}
