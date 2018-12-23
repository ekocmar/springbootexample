package com.emrkoc.examples.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @InjectMocks
    private Calculator calculator;

    @Mock
    private Extractor extractor;

    @Test
    public void extractInt() {
        for (int i = 0; i < 4; i++) {
            when(extractor.extract(i)).thenReturn(i);
        }

        for (int i = 0; i < 4; i++) {
            int value = calculator.extractInt(i);
            checkValue(value,i);
        }

    }

    public void checkValue(int value,int input){
        assertThat(value).isEqualTo(input-1);
    }
}