"""
Write a program that asks the user to enter their name and their age.
Print out a message addressed to them that tells them the year that they will turn 100 years old.

"""

name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2020 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )