package com.company;
import java.lang.reflect.Field;
    public class Task6 {
        public int width, height, top, left;
        private Field[] classFields = Task6.class.getFields();
        private Task6() {
        }
        public Task6(Task6 rectangle) {
            Field[] constructorClassFields = rectangle.getClass().getFields();
            for (int i = 0; i < classFields.length; i++) {
                for (int j = 0; j < constructorClassFields.length; i++) {
                    if (classFields[i].getName().equals(constructorClassFields[j].getName())) {
                        try {
                            classFields[i].set(this, constructorClassFields[j].get(rectangle));
                        } catch (Exception e) { }
                    }
                }
            }
        }

        public Task6(int width, int height, int top, int left) {
            this.width = width;
            this.height = height;
            this.top = top;
            this.left = left;
        }

        public Task6(int width, int height, int top) {
            this.width = width;
            this.height = height;
            this.top = top;
        }

        public Task6(int left, int top) {
            this.left = left;
            this.top = top;
            this.height = this.width = 0;
        }

        public Task6(int width) {
            this.height = this.width = width;
        }
    }

}

