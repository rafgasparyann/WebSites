window.addEventListener('DOMContentLoaded', (event) => {
    const container = document.querySelector('.container');
    container.style.transform = 'translateY(0)';
    container.style.opacity = '1';

    const header = document.querySelector('.header h1');
    header.style.transform = 'translateX(0)';

    // Additional animations on scroll
    window.addEventListener('scroll', () => {
        const content = document.querySelector('.content');
        const image = document.querySelector('.image');

        const scrollPosition = window.scrollY;

        content.style.transform = `translateY(${scrollPosition * 0.2}px)`;
        image.style.transform = `translateY(${scrollPosition * 0.2}px)`;
    });
});
