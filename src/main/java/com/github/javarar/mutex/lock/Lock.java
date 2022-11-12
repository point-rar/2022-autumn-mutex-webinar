package com.github.javarar.mutex.lock;


/**
 * Лок должен предотвращать попадание нескольких потоков в критическую секцию. По определению критической секции ей должен владеть
 * ровно 0 или 1 поток.
 * <p>
 * Можность лока определяется в зависимости от его реализации - то есть валидны реализации локов,
 * работающие на ограниченном множестве потоков
 */
public interface Lock {

    /**
     * Получить доступ к разделяемой памяти (критической секции)
     * Метод возвращает управление в вызывающий поток, в момент когда вызывающий поток захватил Lock
     */
    void lock(); // добавили на backoff

    /**
     * Поток, владелец Lock'а освобождает его, и дает доступ другим потокам возможность побороться за захват Lock'а
     * и доступ в критическую секцию
     */
    void unlock();
}
