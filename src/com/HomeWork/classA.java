package com.HomeWork;





class Point {
    int m_x, m_y;

    public void Point(int x) {

        System.out.println("I am constructor");

    }


     void Point(int x, int y) {

        m_x = x;

        m_y = y;

    }
    public static void main(String args[])  {
        Point p = new Point();
    }
}