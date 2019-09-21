def fizzBuzz():
    n = 100
    for i in range(n):
        # print (i)
        if i % 3 == 0:
            print('Fizz')
        elif i % 5 == 0:
            print('Buzz')
        elif i % 3 == 0 and i % 5 == 0:
            print('FizzBuzz')
        else:
            print (i)

fizzBuzz()
