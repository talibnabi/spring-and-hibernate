package com.company.springdi;

import java.io.IOException;
import java.util.List;

public interface FortuneService {
    List<String> getFortune() throws IOException;
}
