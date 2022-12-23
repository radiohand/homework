package additional.collections.util;

import java.util.function.Supplier;

public class StopWatch implements Supplier<Long> {
    private final long startTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Получить время в мс с момента создания объекта
     * @return разница времени создания объекта и вызова метода
     */
    @Override
    public Long get() {
        long stopTime = System.currentTimeMillis();
        return stopTime - this.startTime;
    }
}
