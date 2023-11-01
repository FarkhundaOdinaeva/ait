package test_entity;

import tools.Id;

public class Animal implements Id {
    @Override
    public long getId() {
        return 1;
    }
}
