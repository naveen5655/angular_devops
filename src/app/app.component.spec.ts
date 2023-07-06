import { TestBed, ComponentFixture } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  let fixture: ComponentFixture<AppComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [AppComponent]
    });
    fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
  });

  it('Testing html element', () => {
    const data = fixture.nativeElement;
    expect(data.querySelector(".Home").textContent).toContain("User");
  });


  it('Testing function', () => {
    const app = fixture.componentInstance;
    expect(app.sum(50, 50)).toBe(100);
  });
});
