package com.compare;

// Tiêu chí để so sánh 2 học sinh với nhau, sẽ dựa trên điểm số của chúng
public class Student implements Comparable<Student>{
    int id;
    String name;
    float score;


    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student object) {
        //Thực hiện so sánh điểm của đối tượng hiện tại, và đối tượng được truyền để so sánh:
        if(object.score > score){
            return -1;
        } else if (object.score < score){
            return 1;
        }
        return 0;
    }

}
