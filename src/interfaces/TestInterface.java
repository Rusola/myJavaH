package interfaces;

public class TestInterface {
    public static void main(String[] args) {

        // Объекту dr будут доступны методы только самого интерфейса(просто с телом метода которое прописано в class Circle)
        Drawable dr = new Circle();
        dr.draw();
        dr = new Square();
        dr.draw(); // теперь ссылка на другой объект и значит и другой метод
    }
}
