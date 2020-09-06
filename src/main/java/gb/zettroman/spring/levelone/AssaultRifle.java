package gb.zettroman.spring.levelone;

public class AssaultRifle implements AutoFireArm {
    private String name;
    private GunClip gunClip;

    public AssaultRifle(String name) {
        this.name = name;
    }

    @Override
    public void shoot() {
        if (gunClip.getBullet()) {
            System.out.println(name + ": single shot fired!");
        } else {
            System.out.println(name + ": gun clip is empty");
        }
    }

    @Override
    public void autoshoot(int shotCount) {
        int actualShotCount = shotCount;
        System.out.println(name + ": Starting autofire for " + shotCount + " shots...");
        if (gunClip.getRestAmmo() < shotCount) actualShotCount = gunClip.getRestAmmo() + 1;
        for (int i = 0; i < actualShotCount; i++) {
            shoot();
        }
        System.out.println(name + ": Autofire is stopped.");
    }

    public GunClip getGunClip() {
        return gunClip;
    }

    public void setGunClip(GunClip gunClip) {
        this.gunClip = gunClip;
    }
}
