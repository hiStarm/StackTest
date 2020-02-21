package com.mzw.StackTest;

/**
 * @author mzw
 * @date 2020/2/21 - 15:36
 */
//使用一维数组模拟栈这种数据结构
public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();

        User user1 = new User("jac",20);
        User user2 = new User("jak",30);
        User user3 = new User("tom",20);
        User user4 = new User("jre",12);
        User user5 = new User("rose",15);
        //压栈
        try {
            stack.Push(user1);
            stack.Push(user2);
            stack.Push(user3);
            stack.Push(user4);
            stack.Push(user5);
        }catch (StackOperationException e){
            e.printStackTrace();
        }

        //向外弹
        try {
            System.out.println(stack.Pop().toString());
            System.out.println(stack.Pop());
            System.out.println(stack.Pop());
            System.out.println(stack.Pop());
            System.out.println(stack.Pop());
        }catch (StackOperationException e){
            e.printStackTrace();
        }

    }
}
