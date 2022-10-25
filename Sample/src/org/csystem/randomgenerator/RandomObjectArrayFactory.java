package org.csystem.randomgenerator;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.MutableFraction;
import org.csystem.util.math.geometry.Circle;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class RandomObjectArrayFactory {
    private final Random m_random;

    //String, Circle, int [], Integer, Character, Boolean, MutableFraction
    private Object createObject() {
        return switch (m_random.nextInt(3)) {
            case 0 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(10, 15));
            case 1 -> new Circle(m_random.nextDouble(-10, 10));
            case 2 -> ArrayUtil.getRandomArray(m_random, m_random.nextInt(5, 10), 0, 99);
            default -> new MutableFraction(m_random.nextInt(-10, 10), m_random.nextInt(-10, 10));
        };
    }

    public RandomObjectArrayFactory() {
        this(new Random());
    }

    public RandomObjectArrayFactory(Random random) {
        m_random = random;
    }

    public Object[] getObjects(int count) {
        Object[] objects = new Object[count];

        for (int i = 0; i < count; ++i)
            objects[i] = createObject();

        return objects;
    }
}