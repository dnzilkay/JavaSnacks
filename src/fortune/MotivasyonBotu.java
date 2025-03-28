package fortune;

public class MotivasyonBotu {
    public static void main(String[] args) {
        String[] sozler = {
                "Başarı sabır işidir ⚡",
                "Her gün KRAL gibi başla 👑",
                "Kod yaz, dünyayı fethet 🔥"
        };
        int sec = (int)(Math.random() * sozler.length);
        System.out.println("🥠 " + sozler[sec]);
    }
}
