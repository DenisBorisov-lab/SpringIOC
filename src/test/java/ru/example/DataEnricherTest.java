package ru.example;


import com.csv.CsvReader;
import com.csv.DataEnricher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
class DataEnricherTest {

    @Mock
    CsvReader csvReader;

    @Test
    void enrichDataTest() {
        DataEnricher dataEnricher = new DataEnricher(csvReader);
        Mockito.when(csvReader.read()).thenReturn(Arrays.asList("34 56 34 23 12".split(" ")));
        dataEnricher.enrichData();
    }
}