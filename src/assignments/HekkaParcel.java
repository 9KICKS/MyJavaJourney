package assignments;

public class HekkaParcel {
    public static int bonus(int parcels) {
        if (parcels >= 1 && parcels <= 49) {
            return 0;
        } else
        if (parcels >= 50 && parcels <= 59) {
            return (int) ((parcels / 100.0) * 100) * 200;
        }
        if (parcels >= 60 && parcels <= 69) {
            return (int) ((parcels / 100.0) * 100) * 250;
        }
        if (parcels >= 70) {
            return (int) ((parcels / 100.0) * 100) * 500;
        }
        return 0;
    }
}