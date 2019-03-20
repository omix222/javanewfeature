enum Fruit {
    Apple,
    Melon,
    Orange
}

void call() {
    Fruit fruit_type = Fruit.Melon;
    int price = switch (fruit_type) {
        case Apple,Orange -> 100;
        case Melon -> 300;
    };
    System.out.print(price);
}

