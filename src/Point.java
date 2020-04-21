public class Point {
        private double x;
        private double y;

        /* не пишем void хотя и ничего не возвращяет.
        Имя как у класса!Служит для задания значений переменных, может быть более 1-ого constructor.  */
        public Point (double a, double b) {
            x = a;
            y = b;
        }
        // Default constructor does not change
        public Point() {
            x = 0;
            y = 0;
        }

        public double distance() {
            // все методы класса имеют доступ к переменным класса
            return Math.sqrt(x * x + y * y);
        }


        // method overloading
        public double distance(double x0, double y0) {
            return Math.sqrt((x-x0) * (x -x0) + (y-y0) * (y - y0));
        }

        //
        public double getX() {
            return x;
        }

        // this.x is a class variable
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
}

