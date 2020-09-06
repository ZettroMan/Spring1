package gb.zettroman.spring.levelone;

public interface AutoFireArm {
    void shoot();
    void autoshoot(int count);
    void setGunClip(GunClip gunClip);
    GunClip getGunClip();
}
