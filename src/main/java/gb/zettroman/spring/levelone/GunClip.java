package gb.zettroman.spring.levelone;

public class GunClip {
    private int capacity;
    private int restAmmo = 0;

    public GunClip(int capacity) {
        this.capacity = capacity;
    }

    public void equip(int ammo) {
        if (ammo > capacity - restAmmo) {
            restAmmo = capacity;
        } else {
            restAmmo += ammo;
        }
    }

    public void equip() {
        restAmmo = capacity;
    }

    public boolean getBullet() {
        if (restAmmo > 0) {
            restAmmo--;
            return true;
        }
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRestAmmo() {
        return restAmmo;
    }
}
