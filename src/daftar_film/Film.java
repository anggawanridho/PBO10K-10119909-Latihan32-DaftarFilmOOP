package daftar_film;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying() {
        System.out.println("Judul Film\t\t: "+filmName);
        System.out.println("Genre Film\t\t: "+filmGenre);
        System.out.printf("Rating Film\t\t: %.1f%n",filmRating);
        System.out.printf("Duration Film\t: %d Menit%n%n",filmDuration);
    }
}
