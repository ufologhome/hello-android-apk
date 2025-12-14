from kivy.app import App
from kivy.uix.button import Button
import webbrowser

class MyApp(App):
    def build(self):
        btn = Button(text="Открыть YouTube")
        btn.bind(on_press=lambda x: webbrowser.open("https://www.youtube.com"))
        return btn

if __name__ == "__main__":
    MyApp().run()
