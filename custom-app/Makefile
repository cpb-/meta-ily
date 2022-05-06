DESTDIR ?= /usr/local/bin

all: custom-app

custom-app: custom-app.c
	$(CC) $(CFLAGS) $(LDFLAGS) -o custom-app custom-app.c

install: custom-app
	cp custom-app $(DESTDIR)/

clean:
	rm -f *.o custom-app
