# Wordle Game

This Java program implements a console-based version of the popular word-guessing game, Wordle.

## Features

- Randomly selects a 5-letter word from a provided word list
- Allows the player to guess the word
- Provides feedback on each guess using a color-coded system
- Tracks available letters for guessing
- Continues until the player guesses the word correctly

## How to Play

1. Run the program.
2. The game will select a random 5-letter word.
3. Enter your guess when prompted.
4. Receive feedback on your guess:
   - `'w'`: The letter is correct and in the right position.
   - `'c'`: The letter is correct but in the wrong position.
   - `'n'`: The letter is not in the word.
5. Use the feedback and remaining letters to make your next guess.
6. Continue guessing until you find the correct word.

## Code Structure

- **Main class**: Contains the game logic and main method.
- **wordleObject class** (not shown): Assumed to handle the game mechanics.
- The program reads words from a file named `wordle.txt`.

## Setup

1. Ensure you have a file named `wordle.txt` containing a list of 5-letter words, one per line.
2. Update the file path in the code to match your `wordle.txt` location.

## Usage

1. Compile and run the `Main.java` file.
2. Follow the on-screen prompts to play the game.

## Notes

- The game uses a simplified text-based interface.
- The word list is read from a file, allowing for easy customization.
- The program includes error handling for file reading.
