import random

number = random.randint(1, 1000)
guess = 0
attempt = 0

while guess != number:

    guess = random.randint(1, 1000)
    if guess == number:
        break
    elif guess != number:
        print(f'{attempt}.\t {guess}')
        attempt += 1
    else:
        print('Something went wrong!')
        break
