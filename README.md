# Swing Quiz App

A Java Swing multiple-choice quiz assignment demonstrating OOP concepts —
inheritance, in particular. `SwingQuiz` launches a chain of `Question`
subclasses (`Question2` → `Question3` → `Question4` → `Question5` → `Last`),
each rendering one question loaded from a text file, before showing the final
score.

## Files

| File                          | Purpose                                                        |
|-------------------------------|-----------------------------------------------------------------|
| `Assignment/SwingQuiz.java`   | Entry point; "Next" button opens the first `Question` window   |
| `Assignment/Question.java`    | `Question` base class plus `Question2`–`Question5` and `Last` subclasses, each wired to advance to the next and tally `point` |
| `Assignment/questions.txt`    | Question bank: `question,option1,option2,option3,option4,correctIndex` (0-based) per line |

## Known limitation

`Question.java` reads `questions.txt` from a **hardcoded absolute path**
(`C:\Users\SayeedTonik\IdeaProjects\untitled\src\Assignment\questions.txt`).
Update that path in the `Question(int a)` constructor to point at your local
copy of `questions.txt` before running, or the question list will silently
fail to load.

## Build & run

From the `OOP Project` directory (so the `Assignment` package resolves correctly):

```bash
javac Assignment/*.java
java Assignment.SwingQuiz
```

## How it works

1. `SwingQuiz` shows a start screen with a "Next" button.
2. Each `Question`/`QuestionN` window shows one question with 4 radio-button
   options; clicking "Next" (or "Finish" on the last question) checks the
   selected answer against `correctAns` and increments the static `point`
   counter, then opens the next window.
3. `Last` shows a button that reveals the final `point` total.
