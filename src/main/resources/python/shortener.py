import pyshorteners
import sys

try:
    if len(sys.argv) <= 1:
        print("Error In Python File")
        sys.exit(1)
    else:
        url = sys.argv[1]

    s = pyshorteners.Shortener()
    x = s.tinyurl.short(url)
    print(x)
except pyshorteners.exceptions.BadURLException:
    print(f"Erro Ao Converter A URL:{url} ")