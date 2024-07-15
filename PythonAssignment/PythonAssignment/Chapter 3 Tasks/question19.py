for side1 in range(1, 20):
    for side2 in range(side1, 20):
        for side3 in range(side2, 20):
            if side1 * side1 + side2 * side2 == side3 * side3:
                print(f"{side1}, {side2}, {side3}")