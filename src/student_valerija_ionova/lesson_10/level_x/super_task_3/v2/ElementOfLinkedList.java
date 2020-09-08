package student_valerija_ionova.lesson_10.level_x.super_task_3.v2;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ElementOfLinkedList {

    private int information;
    private ElementOfLinkedList address;

    ElementOfLinkedList(){}

    ElementOfLinkedList(int information, ElementOfLinkedList address){
        this.information = information;
        this.address = address;
    }

    void setInformation(int information){
        this.information = information;
    }

    void setAddress (ElementOfLinkedList address){
        this.address = address;
    }

    int getInformation(){
        return information;
    }

    ElementOfLinkedList getAddress(){
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementOfLinkedList that = (ElementOfLinkedList) o;
        return information == that.information &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(information, address);
    }

    @Override
    public String toString() {
        return "ElementOfLinkedList{" +
                "information=" + information +
                ", address=" + address +
                '}';
    }
}
