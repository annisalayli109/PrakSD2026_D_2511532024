package pekan4_2511532024;

public class QueueArrayDriver_2511532024 {

	public static void main(String[] args) {
		QueueArray_2511532024 queue_2024 = new QueueArray_2511532024(1000);
		queue_2024.enqueue_2024(10);
		queue_2024.enqueue_2024(20);
		queue_2024.enqueue_2024(30);
		queue_2024.enqueue_2024(40);
		System.out.println("Item di depan " + queue_2024.front_2024());
		System.out.println("Item paling belakang " + queue_2024.rear_2024());
		System.out.println("tampilan queue");
		queue_2024.display_2024();
		System.out.println();
		System.out.println(queue_2024.dequeue_2024() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_2024.front_2024());
		System.out.println("Item di belakang: " + queue_2024.rear_2024());
		System.out.println("tampilan queue setelah saru data dihapus");
		queue_2024.display_2024();
	}
}
