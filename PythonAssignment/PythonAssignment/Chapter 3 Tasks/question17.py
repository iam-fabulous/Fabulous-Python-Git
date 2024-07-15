rows = 10

for row in range(1, rows + 1):
    for col in range(1, row + 1):
        print('*', end=' ')
    print()

rows = 10

for row in range(rows, 0, -1):
    for col in range(1, row + 1):
        print('*', end=' ')
    print()

rows = 10

for row in range(1, rows + 1):
    for col in range(rows - row):
        print(' ', end=' ')
    for col in range(1, row + 1):
        print('*', end=' ')
    print()

rows = 10

for row in range(rows, 0, -1):
    for col in range(rows - row):
        print(' ', end=' ')
    for col in range(1, row + 1):
        print('*', end=' ')
    print()