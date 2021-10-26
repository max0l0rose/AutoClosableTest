package com.company;

public class Main {

    public static void main(String[] args) {
        MyCloseableResource myCloseableResource2;
        try (MyCloseableResource myCloseableResource = new MyCloseableResource()) {
            myCloseableResource2 = myCloseableResource;

            //int b = 1/0; // myCloseableResource2 ??????????

            int a = 1;
        }
        catch (Exception ex) {
            int a = 1;
        }
        finally {
            int a = 1;
        }
    }
}


class MyCloseableResource implements AutoCloseable {
    int handler;

    public MyCloseableResource() {
        this.handler = 1;
    }

    @Override
    public void close() throws Exception {
        handler = 0;
    }
}