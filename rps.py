from random import randint


print('Rock Paper Scissors')

o = ['Win!', 'Loss!', 'Tie!', ' > ', ' < ', ' = ']

rps = ['rock', 'paper', 'scissors']

# 0 = rock, 1 = paper, 2 = scissors

a = int(input('(1) rock, (2) paper, (3) scissors: ')) - 1

b = randint(0, 2)

r = (a - b + 2) % 3

print(rps[a] + o[r + 3] + rps[b] + ". " + o[r])