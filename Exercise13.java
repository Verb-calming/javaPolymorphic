package com.wkcto;

public class Exercise13 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        for (int i = 0;i <= stack.getElements().length ;i++)
            stack.push(new Object());
        for (int i = 0;i <= stack.getElements().length ;i++)
            stack.pop(new Object());

    }
}

class MyStack{
    private Object[] elements;

    private int stackNum;

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getStackNum() {
        return stackNum;
    }

    public void setStackNum(int stackNum) {
        this.stackNum = stackNum;
    }

    public MyStack() {
        this.elements = new Object[10];
        this.stackNum = -1;
    }

    public MyStack(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object object) {
        if (stackNum >= elements.length - 1){
            System.out.println("压栈失败，stack满了！");
            return;
        }
        stackNum++;
        this.elements[stackNum] = object;
        System.out.println("压栈" + object + "元素成功，栈帧指向" + stackNum);
    }

    public void pop(Object object) {
        if (stackNum < 0){
            System.out.println("弹栈失败，stack空了！");
            return;
        }
        System.out.print("压栈"+ elements[stackNum] + "元素成功，");
        stackNum--;
        System.out.println("栈帧指向" + stackNum);
    }
}
