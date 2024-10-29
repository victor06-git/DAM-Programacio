import pygame
import os

def get_emoji(pygame, text, size=24):
    emoji_images = []
    png_folder = os.path.join(os.path.dirname(__file__), "png")  # Ruta absoluta a png
    
    for char in text:
        codepoint = f"{ord(char):X}"
        png_path = os.path.join(png_folder, f"{codepoint}.png")
        
        if os.path.exists(png_path):
            image = pygame.image.load(png_path).convert_alpha()
            scaled_image = pygame.transform.smoothscale(image, (size, size))
            emoji_images.append(scaled_image)
        else:
            print(f"Imatge no trobada per a l'emoji: {char} (codi: {codepoint})")

    return emoji_images