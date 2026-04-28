package pekan4_2511532024;

public class QueueArrayDriver_2511532024 {

	public static void main(String[] args) {
		QueueArray_2511532024 queue = new QueueArray_2511532024(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("Item di depan " + queue.front_2024());
		System.out.println("Item paling belakang " + queue.rear_2024());
		System.out.println("tampilan queue");
		queue.display_2024();
		System.out.println();
		System.out.println(queue.dequeue_2024() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue.front_2024());
		System.out.println("Item di belakang: " + queue.rear_2024());
		System.out.println("tampilan queue setelah saru data dihapus");
		queue.display_2024();
	}
}
