import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Music {

    // List to store the playlist songs
    private List<String> playlist;

    public Music() {
        playlist = new ArrayList<>();
    }

    // Method to add a song to the playlist
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    // Method to delete a song from the playlist
    public void deleteSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found in playlist: " + song);
        }
    }

    // Method to print all songs in the playlist
    public void printPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (String song : playlist) {
                System.out.println("- " + song);
            }
        }
    }

    public static void main(String[] args) {
        Music manager = new Music();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlaylist Menu:");
            System.out.println("1. Add a song");
            System.out.println("2. Delete a song");
            System.out.println("3. Print playlist");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the song name to add: ");
                    String addSong = scanner.nextLine();
                    manager.addSong(addSong);
                    break;
                case 2:
                    System.out.print("Enter the song name to delete: ");
                    String deleteSong = scanner.nextLine();
                    manager.deleteSong(deleteSong);
                    break;
                case 3:
                    manager.printPlaylist();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}