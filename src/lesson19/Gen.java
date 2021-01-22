package lesson19;

import java.util.Objects;

public class Gen<K, V> {
    K x;
    V y;
    V z;

    public Gen(K x, V y, V z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Gen{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gen)) return false;
        Gen<?, ?> gen = (Gen<?, ?>) o;
        return Objects.equals(x, gen.x) && Objects.equals(y, gen.y) && Objects.equals(z, gen.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
