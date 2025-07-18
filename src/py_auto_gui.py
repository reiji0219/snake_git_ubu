# pyautoguiをインストール

import pyautogui
import pyperclip


#pyautogui.moveTo(200, 100)
pyautogui.click(200, 100, button="right")

pyautogui.dragTo(300, 100,
    duration=0.5,  button="left")

pyautogui.keyDown("enter")

pyautogui.typewrite("Hello Pyautogi")

pyperclip.copy("Hello Pyautogi")
pyautogui.hotkey("ctrl","v")



